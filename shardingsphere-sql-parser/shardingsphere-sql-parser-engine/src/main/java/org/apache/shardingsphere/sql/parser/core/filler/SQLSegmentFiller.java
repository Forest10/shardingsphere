/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.shardingsphere.sql.parser.core.filler;

import org.apache.shardingsphere.sql.parser.sql.segment.SQLSegment;
import org.apache.shardingsphere.sql.parser.sql.statement.SQLStatement;

/**
 * SQL segment filler.
 *
 * @author zhangliang
 * @author duhongjun
 * 
 * @param <T> type of SQL segment
 */
public interface SQLSegmentFiller<T extends SQLSegment> {
    
    /**
     * Fill for sharding SQL segment to SQL statement.
     *
     * @param sqlSegment SQL segment
     * @param sqlStatement SQL statement
     */
    void fill(T sqlSegment, SQLStatement sqlStatement);
}