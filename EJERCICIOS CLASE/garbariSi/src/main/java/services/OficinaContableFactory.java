package services;

import entities.observers.OficinaContable;
import entities.observers.adapters.IAdapterSistemaContable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OficinaContableFactory {
  private final IAdapterSistemaContable adapterSistemaContable;

  @Autowired
  public OficinaContableFactory(IAdapterSistemaContable adapterSistemaContable) {
    this.adapterSistemaContable = adapterSistemaContable;
  }

  public OficinaContable crear() {
    return new OficinaContable(adapterSistemaContable);
  }
}
