package uz.jl.ui;


import uz.jl.configs.ApplicationContextHolder;
import uz.jl.service.auth.AuthUserService;
import uz.jl.utils.BaseUtils;
import uz.jl.vo.auth.AuthUserCreateVO;
import uz.jl.vo.auth.Session;
import uz.jl.vo.http.Response;

import java.util.Objects;
import java.util.Scanner;

public class AuthUI {
    static Scanner scanner = new Scanner(System.in);
    static AuthUserService service = ApplicationContextHolder.getBean(AuthUserService.class);
    static AuthUI authUI = new AuthUI();

    public static void main(String[] args) {

        if (Objects.isNull(Session.sessionUser)) {
            System.out.println("Login -> 1");
            System.out.println("Register -> 2");
        } else {
            System.out.println("\nShow workspace List -> 3");
            System.out.println("Workspace settings -> 4");
            System.out.println("Logout -> 0");
        }

        System.out.println("Quit -> q");
        System.out.print("?:");
        String choice = scanner.nextLine();
        switch (choice) {
            case "1" -> authUI.login();
            case "2" -> authUI.register();
            case "3" -> authUI.workSpaceList();
            case "4" -> authUI.workSpaceSettings();
            case "0" -> authUI.logout();
            case "q" -> {
                System.out.println("Bye");
                System.exit(0);
            }
            default -> System.out.println("Wrong Choice");
        }
        main(args);
    }

    private void workSpaceSettings() {
        System.out.println("\nCreate workspace -> 1");
        System.out.println("Show workspace   -> 2");
        System.out.println("Update workspace -> 3");
        System.out.println("Delete workspace -> 4");
        System.out.println("Add member       -> 5");
        System.out.println("Back             -> 0");
        System.out.println("Quit             -> q");
        System.out.print("?:");
        String choice = scanner.nextLine()
                ;
        switch (choice) {
            case "1" -> authUI.workSpaceCreate();
            case "2" -> authUI.workSpaceShow();
            case "3" -> authUI.workSpaceUpdate();
            case "4" -> authUI.workSpaceDelete();
            case "5" -> authUI.add_member();
            case "0" -> {
                return;
            }
            case "q" -> {
                System.out.println("Bye");
                System.exit(0);
            }
            default -> System.out.println("Wrong Choice");
        }
        workSpaceSettings();
    }

    private void workSpaceShow() {



        System.out.println("\nBoard List -> 1");
        System.out.println("Board settings   -> 2");
        System.out.println("Back             -> 0");
        System.out.println("Quit             -> q");
        System.out.print("?:");
        String choice = scanner.nextLine()
                ;
        switch (choice) {
            case "1" -> authUI.boardList();
            case "2" -> authUI.boardSettings();
            case "0" -> {
                return;
            }
            case "q" -> {
                System.out.println("Bye");
                System.exit(0);
            }
            default -> System.out.println("Wrong Choice");
        }
        workSpaceShow();
    }

    private void boardSettings() {
        System.out.println("\nCreate board -> 1");
        System.out.println("Show board   -> 2");
        System.out.println("Update board -> 3");
        System.out.println("Delete board -> 4");
        System.out.println("Back         -> 0");
        System.out.println("Quit         -> q");
        System.out.print("?:");
        String choice = scanner.nextLine()
                ;
        switch (choice) {
            case "1" -> authUI.boardCreate();
            case "2" -> authUI.boardShow();
            case "3" -> authUI.boardUpdate();
            case "4" -> authUI.boardDelete();
            case "0" -> {
                return;
            }
            case "q" -> {
                System.out.println("Bye");
                System.exit(0);
            }
            default -> System.out.println("Wrong Choice");
        }
        boardSettings();
    }

    private void boardDelete() {

    }

    private void boardUpdate() {

    }

    private void boardShow() {


        System.out.println("\nColumn List -> 1");
        System.out.println("Column settings   -> 2");
        System.out.println("Back             -> 0");
        System.out.println("Quit             -> q");
        System.out.print("?:");
        String choice = scanner.nextLine()
                ;
        switch (choice) {
            case "1" -> authUI.columnList();
            case "2" -> authUI.columnSettings();
            case "0" -> {
                return;
            }
            case "q" -> {
                System.out.println("Bye");
                System.exit(0);
            }
            default -> System.out.println("Wrong Choice");
        }
        boardShow();
    }

    private void columnSettings() {
        System.out.println("\nCreate column -> 1");
        System.out.println("Show column   -> 2");
        System.out.println("Update column -> 3");
        System.out.println("Delete column -> 4");
        System.out.println("Back          -> 0");
        System.out.println("Quit          -> q");
        System.out.print("?:");
        String choice = scanner.nextLine()
                ;
        switch (choice) {
            case "1" -> authUI.columnCreate();
            case "2" -> authUI.columnShow();
            case "3" -> authUI.columnUpdate();
            case "4" -> authUI.columnDelete();
            case "0" -> {
                return;
            }
            case "q" -> {
                System.out.println("Bye");
                System.exit(0);
            }
            default -> System.out.println("Wrong Choice");
        }
        columnSettings();
    }

    private void columnDelete() {

    }

    private void columnUpdate() {

    }

    private void columnShow() {
        /***
         * Column show qilinganda column malumotlari va undagi task va
         * uning funksiyalari tursin
         */


        System.out.println("\nTask List       -> 1");
        System.out.println("Task settings   -> 2");
        System.out.println("Back            -> 0");
        System.out.println("Quit            -> q");
        System.out.print("?:");
        String choice = scanner.nextLine()
                ;
        switch (choice) {
            case "1" -> authUI.taskList();
            case "2" -> authUI.taskSettings();
            case "0" -> {
                return;
            }
            case "q" -> {
                System.out.println("Bye");
                System.exit(0);
            }
            default -> System.out.println("Wrong Choice");
        }
        columnShow();
    }

    private void taskSettings() {
        System.out.println("\nCreate task -> 1");
        System.out.println("Show task   -> 2");
        System.out.println("Update task -> 3");
        System.out.println("Delete task -> 4");
        System.out.println("Move task   -> 5");
        System.out.println("Back        -> 0");
        System.out.println("Quit        -> q");
        System.out.print("?:");
        String choice = scanner.nextLine()
                ;
        switch (choice) {
            case "1" -> authUI.taskCreate();
            case "2" -> authUI.taskShow();
            case "3" -> authUI.taskUpdate();
            case "4" -> authUI.taskDelete();
            case "5" -> authUI.taskMove();
            case "0" -> {
                return;
            }
            case "q" -> {
                System.out.println("Bye");
                System.exit(0);
            }
            default -> System.out.println("Wrong Choice");
        }
        taskSettings();
    }

    private void taskMove() {

    }

    private void taskDelete() {

    }

    private void taskUpdate() {

    }

    private void taskShow() {
        /***
         * Task haqida malumotlar chiqib tursin va unga tegishli funksiyalar ham bo'lsin
         */

        System.out.println("\nComment List       -> 1");
        System.out.println("Comment settings   -> 2");
        System.out.println("Back               -> 0");
        System.out.println("Quit               -> q");
        System.out.print("?:");
        String choice = scanner.nextLine()
                ;
        switch (choice) {
            case "1" -> authUI.commentList();
            case "2" -> authUI.commentSettings();
            case "0" -> {
                return;
            }
            case "q" -> {
                System.out.println("Bye");
                System.exit(0);
            }
            default -> System.out.println("Wrong Choice");
        }
        taskShow();
    }

    private void commentSettings() {
        System.out.println("\nCreate comment -> 1");
        System.out.println("Update comment -> 2");
        System.out.println("Delete comment -> 3");
        System.out.println("Back           -> 0");
        System.out.println("Quit           -> q");
        System.out.print("?:");
        String choice = scanner.nextLine()
                ;
        switch (choice) {
            case "1" -> authUI.commentCreate();
            case "2" -> authUI.commentUpdate();
            case "3" -> authUI.commentDelete();
            case "0" -> {
                return;
            }
            case "q" -> {
                System.out.println("Bye");
                System.exit(0);
            }
            default -> System.out.println("Wrong Choice");
        }
        commentSettings();
    }

    private void commentDelete() {

    }

    private void commentUpdate() {

    }

    private void commentCreate() {

    }

    private void commentList() {

    }

    private void taskCreate() {

    }

    private void taskList() {

    }

    private void columnCreate() {

    }

    private void columnList() {

    }

    private void boardCreate() {

    }

    private void boardList() {

    }

    private void add_member() {

    }

    private void workSpaceDelete() {

    }

    private void workSpaceUpdate() {

    }

    private void workSpaceCreate() {

    }

    private void workSpaceList() {


    }




    private void logout() {
        Session.sessionUser = null;
    }

    private void register() {
        System.out.println("Enter username: ");
        String userName = scanner.nextLine();
        System.out.println("Enter email: ");
        String email = scanner.nextLine();
        System.out.println("Enter password: ");
        String password = scanner.nextLine();

        AuthUserCreateVO vo = AuthUserCreateVO.builder()
                .username(userName)
                .email(email)
                .password(password)
                .build();
        print_response(service.create(vo));
    }

    private void login() {
        System.out.println("Enter username: ");
        String username = scanner.nextLine() ;
        System.out.println("Enter password: ");
        String password = scanner.nextLine() ;
        print_response(service.login(username, password));
    }

    public void print_response(Response response) {

        System.out.println(response.getBody());
    }
}
