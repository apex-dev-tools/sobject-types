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
public class CollaborationGroupRecordChangeEvent extends SObject {
	public static SObjectType$<CollaborationGroupRecordChangeEvent> SObjectType;
	public static SObjectFields$<CollaborationGroupRecordChangeEvent> Fields;

	public Object ChangeEventHeader;
	public Id CollaborationGroupId;
	public CollaborationGroup CollaborationGroup;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public Id Id;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Id RecordId;
	public SObject Record;
	public String ReplayId;

	public CollaborationGroupRecordChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public CollaborationGroupRecordChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public CollaborationGroupRecordChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public CollaborationGroupRecordChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public CollaborationGroupRecordChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
