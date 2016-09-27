package LabChapter4.FourDotTwentyFour;

/**
 * Created by nraley on 10/17/15.
 */
import java.io.File;
import java.io.FileFilter;

public class PartA {
    class DirectoryMatcher implements FileFilter {
        @Override
        public boolean accept(File pathname) {
            return pathname.isDirectory();
        }
    }

//    class FileMatcher implements FileFilter {
//        @Override
//        public boolean accept(File pathname) {
//            return pathname.isFile();
//        }
//    }

    public static void main(String[] args) {
        PartA a = new PartA();
        File file = a.filePrinter(new File(args[0]));
        System.out.println("Largest file: " + file.getName() + "\n" + file.getAbsolutePath() + "\n" + file.length());
    }

    public File filePrinter(File abstractPathname) {
        System.out.println(abstractPathname.getAbsolutePath() + ":");
//        File[] files = abstractPathname.listFiles(new FileMatcher());
        // anonymous inner class (Java 8 has lambdas?)
        File[] files = abstractPathname.listFiles(new FileFilter()
        { public boolean accept(File pathname) {
            return pathname.isFile();
        }});

        File maxFile = null;

        if (files != null) {
            for (File f : files) {
                System.out.printf("%-10d %s%n", f.length(), f.getName());
                if ((maxFile == null) || f.length() > maxFile.length()) {
                    maxFile = f;
                }
            }
            System.out.println();

            File[] directories = abstractPathname.listFiles(new DirectoryMatcher());
            if (directories != null) {
                for (File f : directories) {
                    File x = filePrinter(f);
                    if ((maxFile == null) || x.length() > maxFile.length()) {
                        maxFile = x;
                    }
                }
            }
        }
        return maxFile;
    }
}