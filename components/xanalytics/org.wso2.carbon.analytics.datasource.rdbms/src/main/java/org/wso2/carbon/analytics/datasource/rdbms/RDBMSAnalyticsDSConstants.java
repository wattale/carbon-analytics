/*
 *  Copyright (c) 2014, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 *  WSO2 Inc. licenses this file to you under the Apache License,
 *  Version 2.0 (the "License"); you may not use this file except
 *  in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing,
 *  software distributed under the License is distributed on an
 *  "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 *  KIND, either express or implied.  See the License for the
 *  specific language governing permissions and limitations
 *  under the License.
 *
 */
package org.wso2.carbon.analytics.datasource.rdbms;

import org.wso2.carbon.analytics.datasource.core.AnalyticsDataSource;

/**
 * Constants related to RDBMS based {@link AnalyticsDataSource}s.
 */
public class RDBMSAnalyticsDSConstants {

    public static final String DATASOURCE = "datasource";
    
    public static final String FS_PATH_TABLE = "AN_FS_PATH";
        
    public static final String FS_DATA_TABLE = "AN_FS_DATA";
    
    public static final int FS_DATA_CHUNK_SIZE = 1024;
    
    public static final byte[] FS_EMPTY_DATA_CHUNK = new byte[FS_DATA_CHUNK_SIZE];
        
}