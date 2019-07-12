/*
 * JBoss, Home of Professional Open Source.
 * Copyright 2016, Red Hat, Inc., and individual contributors
 * as indicated by the @author tags. See the copyright.txt file in the
 * distribution for a full listing of individual contributors.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */
package org.jboss.additional.testsuite.jdkall.present.basic;

import org.jboss.arquillian.junit.Arquillian;
import org.jboss.eap.additional.testsuite.annotations.EapAdditionalTestsuite;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.Assert;
import static org.junit.Assert.assertFalse;




@RunWith(Arquillian.class)
@EapAdditionalTestsuite({"modules/testcases/jdkAll/WildflyRelease-13.0.0.Final/basic/src/main/java","modules/testcases/jdkAll/Wildfly/basic/src/main/java","modules/testcases/jdkAll/Eap72x/basic/src/main/java","modules/testcases/jdkAll/Eap72x-Proposed/basic/src/main/java","modules/testcases/jdkAll/Eap7/basic/src/main/java","modules/testcases/jdkAll/Eap71x-Proposed/basic/src/main/java","modules/testcases/jdkAll/Eap71x/basic/src/main/java","modules/testcases/jdkAll/Eap7.1.0.Beta/basic/src/main/java","modules/testcases/jdkAll/Eap70x/basic/src/main/java","modules/testcases/jdkAll/Eap70x-Proposed/basic/src/main/java","modules/testcases/jdkAll/Eap64x/basic/src/main/java","modules/testcases/jdkAll/Eap64x-Proposed/basic/src/main/java","modules/testcases/jdkAll/WildflyRelease-10.1.0.Final/basic/src/main/java","modules/testcases/jdkAll/Eap63x/basic/src/main/java","modules/testcases/jdkAll/Eap62x/basic/src/main/java","modules/testcases/jdkAll/Eap61x/basic/src/main/java"})
public class CheckCommitTestCase extends Assert {

    
    @Test
    public void testJobOperatorIsAvailable() throws Exception {
        if(getRandomBoolean())) {
            Assert.fail();
        }
    }

    public static boolean getRandomBoolean() {
        //return Math.random() < 0.5;
        // I tried another approaches here, still the same result
        final String result = System.getenv("BISECT_TEST");
        if(result == null) {
            throw new RuntimeException();
        } else {
            return Boolean.valueOf(result.toLowerCase());
        }
    }
}
