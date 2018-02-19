package test.all;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import test.com.model.TrianguloTest;
import test.com.operacoes.InputValidatorTest;
import test.com.operacoes.OperacoesTrianguloTest;

@RunWith(Suite.class)
@Suite.SuiteClasses({ 
	TrianguloTest.class,
	InputValidatorTest.class,
	OperacoesTrianguloTest.class })
public class AllTests {
}
