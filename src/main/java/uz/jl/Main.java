package uz.jl;

import uz.jl.configs.ApplicationContextHolder;
import uz.jl.configs.PasswordConfigurer;
import uz.jl.dao.auth.AuthUserDAO;
import uz.jl.domains.auth.AuthUser;
import uz.jl.service.auth.AuthUserService;
import uz.jl.utils.BaseUtils;
import uz.jl.vo.auth.AuthUserCreateVO;
import uz.jl.vo.auth.AuthUserVO;
import uz.jl.vo.http.Response;

import java.util.Scanner;

public class Main {
    AuthUserService service = ApplicationContextHolder.getBean(AuthUserService.class);
    public static void main(String[] args) {

        Main main = new Main();
//        AuthUserCreateVO vo = AuthUserCreateVO.builder()
//                .username(new Scanner(System.in).next())
//                .email(new Scanner(System.in).next())
//                .password(new Scanner(System.in).next())
//                .build();
//        service.create(vo);

        System.out.println("Login -> 1");
        System.out.println("Register -> 2");
        System.out.println("Quit -> q");
        String choice = ("?:");
        switch (choice) {
            case "1" -> main.login();
            case "2" -> main.register();
            case "q" -> {
                System.out.println("Bye");
                System.exit(0);
            }
            default -> System.out.println("Wrong Choice");
        }
//        main(args);


    }

    private void register() {

    }

    private void login() {
        Response<AuthUserVO> response = service.login(
                ("username ? "),
                ("password ? ")
        );

        print_response(response);
    }

    private void print_response(Response<AuthUserVO> response) {

        System.out.println(response.getError());
    }

}