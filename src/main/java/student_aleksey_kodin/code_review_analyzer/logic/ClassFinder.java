package student_aleksey_kodin.code_review_analyzer.logic;

import java.io.IOException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class ClassFinder {
    private boolean isFilePathCorrect;

    public List<String> findAllClassesInPackage(String scannedPackage) throws IOException {
        List<String> allClassesWithFullPath = findAllFilesAndFullPath(scannedPackage);

        if (allClassesWithFullPath == null) {
            return null;
        }
        return allClassesWithFullPath.stream()
                .map(path -> prepareClassPath(path, scannedPackage))
                .collect(Collectors.toList());
    }

    private List<String> findAllFilesAndFullPath(String scannedPackage) throws IOException {
        final char PKG_SEPARATOR = '.';
        final char DIR_SEPARATOR = '/';
        List<String> allFiles;

        String scannedPath = scannedPackage.replace(PKG_SEPARATOR, DIR_SEPARATOR);

        URL fullPackagePath = Thread.currentThread().getContextClassLoader().getResource(scannedPath);

        if (fullPackagePath == null) {
            isFilePathCorrect = false;
            return null;
        }

        String currentFullPackagePath = fullPackagePath.getPath();
        currentFullPackagePath = currentFullPackagePath.substring(1);

        allFiles = Files.walk(Paths.get(currentFullPackagePath))
                .filter(Files::isRegularFile).map(Path::toString)
                .collect(Collectors.toList());

        isFilePathCorrect = true;
        return allFiles;
    }

    private String prepareClassPath(String fullPath, String scannedPackage) {
        final int ExcludeExtensionAndPoint = 6;
        final char PKG_SEPARATOR = '.';
        final char DIR_SEPARATOR = 92;

        String preparePath = fullPath.replace(DIR_SEPARATOR, PKG_SEPARATOR);
        int getStartPositionInCurrentPackage = preparePath.indexOf(scannedPackage);

        return preparePath.substring(getStartPositionInCurrentPackage,
                fullPath.length() - ExcludeExtensionAndPoint);
    }

    public boolean isFilePathCorrect() {
        return isFilePathCorrect;
    }
}
