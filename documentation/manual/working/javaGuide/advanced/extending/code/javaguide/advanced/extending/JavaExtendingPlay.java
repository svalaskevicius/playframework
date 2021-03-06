/*
 * Copyright (C) 2009-2016 Typesafe Inc. <http://www.typesafe.com>
 */
package javaguide.advanced.extending;

import org.junit.Test;

import play.Application;
import play.inject.guice.GuiceApplicationBuilder;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

public class JavaExtendingPlay {

    @Test
    public void testModule() throws Exception {
        // #module-class-binding
        Application application = new GuiceApplicationBuilder()
                .bindings(new MyModule())
                .build();
        // #module-class-binding
        MyApi api = application.injector().instanceOf(MyApi.class);

        assertNotNull(api);
    }

}
