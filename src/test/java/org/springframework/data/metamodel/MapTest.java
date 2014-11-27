package org.springframework.data.metamodel;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(loader = AnnotationConfigContextLoader.class, classes = MapTestContextConfiguration.class)
public class MapTest {
	@Autowired
	private DefaultContainerRepository defaultContainerRepository;

	@Test
	public void testSomething() throws Exception {
		DefaultContainer container = new DefaultContainer();
		defaultContainerRepository.save(container);
	}
}