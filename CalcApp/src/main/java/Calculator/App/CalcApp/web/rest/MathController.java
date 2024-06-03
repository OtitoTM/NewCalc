package Calculator.App.CalcApp.web.rest;


import Calculator.App.CalcApp.Service.DTO.MathRequestDTO;
import Calculator.App.CalcApp.Service.MathService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/calc")
public class MathController {
    MathService mathService = new MathService();

    @PostMapping("/add")
    public double add(@RequestBody MathRequestDTO mathRequestDTO) {
        return mathService.add(mathRequestDTO.getNumber1(), mathRequestDTO.getNumber2());
    }

    @PostMapping("/subtract")
    public double subtract(@RequestBody MathRequestDTO mathRequestDTO) {
        return mathService.subtract(mathRequestDTO.getNumber1(), mathRequestDTO.getNumber2());
    }

    @PostMapping("/multiply")
    public double multiply(@RequestBody MathRequestDTO mathRequestDTO) {
        return mathService.multiply(mathRequestDTO.getNumber1(), mathRequestDTO.getNumber2());
    }

    @PostMapping("/divide")
    public double divide(@RequestBody MathRequestDTO mathRequestDTO) {
        return mathService.divide(mathRequestDTO.getNumber1(), mathRequestDTO.getNumber2());
    }
}
