package nc.vo.qcco.bdtestrefs;

import nc.md.model.IEnumValue;
import nc.md.model.impl.MDEnum;


public class TestParaWaysEnum extends MDEnum{

	public TestParaWaysEnum(IEnumValue enumValue) {
		super(enumValue);
		// TODO Auto-generated constructor stub
	}
	public static final TestParaWaysEnum before = MDEnum.valueOf(TestParaWaysEnum.class, Integer.valueOf(1));

	public static final TestParaWaysEnum after = MDEnum.valueOf(TestParaWaysEnum.class, Integer.valueOf(2));
}
