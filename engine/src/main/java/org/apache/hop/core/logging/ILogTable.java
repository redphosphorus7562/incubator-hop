/*! ******************************************************************************
 *
 * Hop : The Hop Orchestration Platform
 *
 * http://www.project-hop.org
 *
 *******************************************************************************
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 ******************************************************************************/

package org.apache.hop.core.logging;

import org.apache.hop.pipeline.transform.TransformMeta;
import org.w3c.dom.Node;

import java.util.List;

public interface ILogTable extends ILogTableCore {

  /**
   * @return The log table meta-data in XML format.
   */
  String getXML();

  /**
   * Load the information for this logging table from the workflow XML node
   *
   * @param workflowNode the node to load from
   * @param transforms   the transforms to reference (or null)
   */
  void loadXML( Node workflowNode, List<TransformMeta> transforms );

}