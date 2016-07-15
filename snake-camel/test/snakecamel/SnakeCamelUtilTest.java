package snakecamel;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Test;

public class SnakeCamelUtilTest {

	@Test
	public void capitalizeでabcがAbcに変換される() {
		String expected = "Abc";
		String actual = SnakeCamelUtil.capitalize("abc");
		assertThat(actual, is(expected));
	}
	@Test
	public void capitalizeでaがAに変換される() {
		String expected = "A";
		String actual = SnakeCamelUtil.capitalize("a");
		assertThat(actual, is(expected));
	}
	@Test
	public void uncapitalizeでAbcがabcに変換される() {
		String expected = "abc";
		String actual = SnakeCamelUtil.uncapitalize("Abc");
		assertThat(actual, is(expected));
	}
	@Test
	public void uncapitalizeでAがaに変換される() {
		String expected = "a";
		String actual = SnakeCamelUtil.uncapitalize("A");
		assertThat(actual, is(expected));
	}
	@Test
	public void snakeToCamelcaseでabc_def_ghiがAbcDefGhiに変換される() {
		String expected = "AbcDefGhi";
		String actual = SnakeCamelUtil.snakeToCamelcase("abc_def_ghi");
		assertThat(actual, is(expected));
	}
	@Test
	public void camelToSnakecaseでAbcDefGhiがabc_def_ghiに変換される() {
		String expected = "abc_def_ghi";
		String actual = SnakeCamelUtil.camelToSnakecase("AbcDefGhi");
		assertThat(actual, is(expected));
	}

}
