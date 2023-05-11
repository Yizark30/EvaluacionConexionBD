package androidx.databinding;

public class DataBinderMapperImpl extends MergedDataBinderMapper {
  DataBinderMapperImpl() {
    addMapper(new ni.edu.uca.sistematicopersistencia.DataBinderMapperImpl());
  }
}
