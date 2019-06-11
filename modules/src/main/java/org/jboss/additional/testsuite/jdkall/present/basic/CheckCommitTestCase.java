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

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;






@RunWith(Arquillian.class)
@EapAdditionalTestsuite({"modules/testcases/jdkAll/WildflyRelease-13.0.0.Final/basic/src/main/java","modules/testcases/jdkAll/Wildfly/basic/src/main/java","modules/testcases/jdkAll/Eap72x/basic/src/main/java","modules/testcases/jdkAll/Eap72x-Proposed/basic/src/main/java","modules/testcases/jdkAll/Eap7/basic/src/main/java","modules/testcases/jdkAll/Eap71x-Proposed/basic/src/main/java","modules/testcases/jdkAll/Eap71x/basic/src/main/java","modules/testcases/jdkAll/Eap7.1.0.Beta/basic/src/main/java","modules/testcases/jdkAll/Eap70x/basic/src/main/java","modules/testcases/jdkAll/Eap70x-Proposed/basic/src/main/java","modules/testcases/jdkAll/Eap64x/basic/src/main/java","modules/testcases/jdkAll/Eap64x-Proposed/basic/src/main/java","modules/testcases/jdkAll/WildflyRelease-10.1.0.Final/basic/src/main/java","modules/testcases/jdkAll/Eap63x/basic/src/main/java","modules/testcases/jdkAll/Eap62x/basic/src/main/java","modules/testcases/jdkAll/Eap61x/basic/src/main/java"})
public class CheckCommitTestCase extends Assert {

    static Set<String> goodOnes = new HashSet<>();
    static {
    goodOnes.add("10338a523f34e93d79505cdaf023cfc7ae2aa187");
goodOnes.add("dd41d9c64fd18724465445d00a4acc9588713df9");
goodOnes.add("58ca0e17f5034e1902db7f5699f542fc98ca629e"); 
goodOnes.add("e3658687549b54075aa1c926ee3bb3fb8bc4b2c3"); 
goodOnes.add("2155b020bda755d168b47a6686498a83c58d2369"); 
goodOnes.add("8fa9e1be80b73df2f1d2494e9d4af8f552aba9f8"); 
goodOnes.add("76a863768826eb15e2529e791066b6f80352a7f8"); 
goodOnes.add("fcba993b3585835858355a3415ced5825d2ded96");
goodOnes.add("aaaac9dde67c42557b5e2d937c6d10420b89ee3a");

    }
    @Test
    public void testJobOperatorIsAvailable() throws Exception {
        ProcessBuilder processBuilder = new ProcessBuilder("/bin/bash","-c", "git rev-parse HEAD");
        Process process = processBuilder.start();
        process.waitFor();
        InputStream inputStream = process.getInputStream();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        final String commit = bufferedReader.readLine();
        if(!goodOnes.contains(commit)) {
            Assert.fail();
        }
    }
}
