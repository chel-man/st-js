/**
 *  Copyright 2011 Alexandru Craciun, Eyal Kaspi
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package org.stjs.generator.scope.declarations;

@SuppressWarnings("unused")
public class DeclarationWithOuter3 extends ParentDeclaration1 {
	int type = 3;

	public void x(int param) {
		new Runnable() {
			int type = 1;

			@Override
			public void run() {
				int exp5 = DeclarationWithOuter3.this.type;
			}
		};
	}

}
