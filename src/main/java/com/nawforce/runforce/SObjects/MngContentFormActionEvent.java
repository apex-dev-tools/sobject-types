/*
 * Copyright (c) 2025 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class MngContentFormActionEvent extends SObject {
	public static SObjectType$<MngContentFormActionEvent> SObjectType;
	public static SObjectFields$<MngContentFormActionEvent> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String EventUuid;
	public String FormContentKey;
	public String FormData;
	public String FormVersion;
	public String IndividualKey;
	public String ReferenceRecord;
	public String ReplayId;

	public MngContentFormActionEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public MngContentFormActionEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public MngContentFormActionEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public MngContentFormActionEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public MngContentFormActionEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
