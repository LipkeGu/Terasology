/*
 * Copyright 2014 MovingBlocks
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.terasology.world.propagation;

import org.terasology.math.Side;
import org.terasology.math.Vector3i;
import org.terasology.world.block.Block;
import org.terasology.world.chunks.internal.ChunkImpl;

/**
 * @author Immortius
 */
public interface BatchPropagator {
    void process(BlockChange... changes);

    void process(Iterable<BlockChange> blockChanges);

    void propagateBetween(ChunkImpl chunk, ChunkImpl adjChunk, Side side, boolean propagateExternal);

    void propagateFrom(Vector3i pos, Block block);

    void propagateFrom(Vector3i pos, byte value);

    void regenerate(Vector3i pos, byte value);
}
