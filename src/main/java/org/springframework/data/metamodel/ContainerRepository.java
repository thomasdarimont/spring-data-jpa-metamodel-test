package org.springframework.data.metamodel;

import org.springframework.data.envers.repository.support.EnversRevisionRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface ContainerRepository<T extends Container> extends EnversRevisionRepository<T, Integer, Integer> {
}
