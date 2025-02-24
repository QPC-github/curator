/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.apache.curator.x.discovery.details;

import org.apache.curator.x.discovery.ServiceInstance;

/**
 * Injectable serializer for service instances
 */
public interface InstanceSerializer<T>
{
    /**
     * Serialize an instance into bytes
     *
     * @param instance the instance
     * @return byte array representing the instance
     * @throws Exception any errors
     */
    public byte[]             serialize(ServiceInstance<T> instance) throws Exception;

    /**
     * Deserialize a byte array into an instance
     *
     * @param bytes the bytes
     * @return service instance
     * @throws Exception any errors
     */
    public ServiceInstance<T> deserialize(byte[] bytes) throws Exception;
}
