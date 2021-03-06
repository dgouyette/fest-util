/*
 * Created on Sep 22, 2006
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the
 * License. You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS"
 * BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language
 * governing permissions and limitations under the License.
 * 
 * Copyright @2006-2011 the original author or authors.
 */
package org.fest.util;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Tests for <code>{@link Strings#isEmpty(String)}</code>.
 * 
 * @author Alex Ruiz
 */
public class Strings_isEmpty_Test {

  @Test
  public void should_return_true_if_String_is_empty() {
    assertTrue(Strings.isEmpty(""));
  }

  @Test
  public void should_return_true_if_String_is_null() {
    assertTrue(Strings.isEmpty(null));
  }

  @Test
  public void should_return_false_if_String_is_not_empty() {
    assertFalse(Strings.isEmpty("foo"));
  }
}
