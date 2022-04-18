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
package org.openhab.binding.bluetooth.bluegiga.internal.command.connection;

import org.eclipse.jdt.annotation.NonNullByDefault;
import org.openhab.binding.bluetooth.bluegiga.internal.BlueGigaDeviceResponse;

/**
 * Class to implement the BlueGiga command <b>versionIndEvent</b>.
 * <p>
 * This event indicates the remote devices version.
 * <p>
 * This class provides methods for processing BlueGiga API commands.
 * <p>
 * Note that this code is autogenerated. Manual changes may be overwritten.
 *
 * @author Chris Jackson - Initial contribution of Java code generator
 */
@NonNullByDefault
public class BlueGigaVersionIndEvent extends BlueGigaDeviceResponse {
    public static int COMMAND_CLASS = 0x03;
    public static int COMMAND_METHOD = 0x01;

    /**
     * Bluetooth controller specification version
     * <p>
     * BlueGiga API type is <i>uint8</i> - Java type is {@link int}
     */
    private int versNr;

    /**
     * Manufacturer of the controller
     * <p>
     * BlueGiga API type is <i>uint16</i> - Java type is {@link int}
     */
    private int compId;

    /**
     * Bluetooth controller version
     * <p>
     * BlueGiga API type is <i>uint16</i> - Java type is {@link int}
     */
    private int subVersNr;

    /**
     * Event constructor
     */
    public BlueGigaVersionIndEvent(int[] inputBuffer) {
        // Super creates deserializer and reads header fields
        super(inputBuffer);

        event = (inputBuffer[0] & 0x80) != 0;

        // Deserialize the fields
        connection = deserializeUInt8();
        versNr = deserializeUInt8();
        compId = deserializeUInt16();
        subVersNr = deserializeUInt16();
    }

    /**
     * Bluetooth controller specification version
     * <p>
     * BlueGiga API type is <i>uint8</i> - Java type is {@link int}
     *
     * @return the current vers_nr as {@link int}
     */
    public int getVersNr() {
        return versNr;
    }

    /**
     * Manufacturer of the controller
     * <p>
     * BlueGiga API type is <i>uint16</i> - Java type is {@link int}
     *
     * @return the current comp_id as {@link int}
     */
    public int getCompId() {
        return compId;
    }

    /**
     * Bluetooth controller version
     * <p>
     * BlueGiga API type is <i>uint16</i> - Java type is {@link int}
     *
     * @return the current sub_vers_nr as {@link int}
     */
    public int getSubVersNr() {
        return subVersNr;
    }

    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder();
        builder.append("BlueGigaVersionIndEvent [connection=");
        builder.append(connection);
        builder.append(", versNr=");
        builder.append(versNr);
        builder.append(", compId=");
        builder.append(compId);
        builder.append(", subVersNr=");
        builder.append(subVersNr);
        builder.append(']');
        return builder.toString();
    }
}
