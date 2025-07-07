/*
 * Copyright 2024 The Netty Project
 *
 * The Netty Project licenses this file to you under the Apache License,
 * version 2.0 (the "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at:
 *
 *   https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */
package io.netty.channel;

/**
 * An IO event that is dispatched to an {@link IoHandle} as a result of a previous submitted {@link IoOps}.
 * 
 * 一个I/O事件被提交到{@link IoHandle}，作为之前提交的{@link IoOps}的结果。
 * 
 * 具体的{@link IoHandle}实现支持不同的具体的{@link IoEvent}实现。
 * Concrete {@link IoHandle} implementations support different concrete {@link IoEvent} implementations.
 */
public interface IoEvent {
    // Marker interface.
}
