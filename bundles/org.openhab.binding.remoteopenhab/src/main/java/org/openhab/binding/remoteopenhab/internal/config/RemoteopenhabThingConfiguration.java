/**
 * Copyright (c) 2010-2022 Contributors to the openHAB project
 *
 * See the NOTICE file(s) distributed with this work for additional
 * information.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 *
 * SPDX-License-Identifier: EPL-2.0
 */
package org.openhab.binding.remoteopenhab.internal.config;

import org.eclipse.jdt.annotation.NonNullByDefault;

/**
 * The {@link RemoteopenhabThingConfiguration} is responsible for holding
 * configuration informations associated to a remote openHAB thing
 * thing type
 *
 * @author Laurent Garnier - Initial contribution
 */
@NonNullByDefault
public class RemoteopenhabThingConfiguration {
    public static final String THING_UID = "thingUID";

    public String thingUID = "";
    public boolean buildTriggerChannels = true;
}
