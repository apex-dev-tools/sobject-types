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
public class GnrcVstTaskContextRelationHistory extends SObject {
	public static SObjectType$<GnrcVstTaskContextRelationHistory> SObjectType;
	public static SObjectFields$<GnrcVstTaskContextRelationHistory> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String DataType;
	public String Division;
	public String Field;
	public Id GnrcVstTaskContextRelationId;
	public GnrcVstTaskContextRelation GnrcVstTaskContextRelation;
	public Id Id;
	public Boolean IsDeleted;
	public Object NewValue;
	public Object OldValue;

	public GnrcVstTaskContextRelationHistory clone$() {throw new java.lang.UnsupportedOperationException();}
	public GnrcVstTaskContextRelationHistory clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public GnrcVstTaskContextRelationHistory clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public GnrcVstTaskContextRelationHistory clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public GnrcVstTaskContextRelationHistory clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
