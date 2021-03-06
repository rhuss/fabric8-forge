/**
 *  Copyright 2005-2015 Red Hat, Inc.
 *
 *  Red Hat licenses this file to you under the Apache License, version
 *  2.0 (the "License"); you may not use this file except in compliance
 *  with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or
 *  implied.  See the License for the specific language governing
 *  permissions and limitations under the License.
 */
package io.fabric8.forge.rest.hooks;

import io.fabric8.forge.rest.dto.ExecutionRequest;
import io.fabric8.project.support.UserDetails;
import io.fabric8.forge.rest.ui.RestUIContext;
import org.jboss.forge.addon.ui.controller.CommandController;
import io.fabric8.forge.rest.dto.ExecutionResult;

import javax.servlet.http.HttpServletRequest;

/**
 * Perform any hooks after a command has completed such as working with a source control system
 */
public interface CommandCompletePostProcessor {
    void firePostCompleteActions(String name, ExecutionRequest executionRequest, RestUIContext context, CommandController controller, ExecutionResult results, HttpServletRequest request);

    UserDetails preprocessRequest(String name, ExecutionRequest executionRequest, HttpServletRequest request);
}
