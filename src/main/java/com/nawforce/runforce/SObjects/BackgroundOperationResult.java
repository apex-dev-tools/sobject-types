/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class BackgroundOperationResult extends SObject {
	public static SObjectType$<BackgroundOperationResult> SObjectType;
	public static SObjectFields$<BackgroundOperationResult> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String Data;
	public Id Id;
	public String Message;
	public String MessageType;
	public Id ParentId;
	public SObject Parent;

	public BackgroundOperationResult clone$() {throw new java.lang.UnsupportedOperationException();}
	public BackgroundOperationResult clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public BackgroundOperationResult clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public BackgroundOperationResult clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public BackgroundOperationResult clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
