package pl.carservice.converters;

import org.springframework.core.convert.converter.Converter;

import pl.carservice.dto.RecordRange;

public class RecordRangeConverter implements Converter<String, RecordRange> {

	@Override
	public RecordRange convert(String source) {
		return new RecordRange(Integer.parseInt(source.substring(0,source.indexOf("-"))), 
				Integer.parseInt(source.substring(source.indexOf("-")+1)));
	}

}
