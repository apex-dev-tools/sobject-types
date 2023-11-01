/*
 * Copyright (c) 2023 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class CollaborationRoom extends SObject {
	public static SObjectType$<CollaborationRoom> SObjectType;
	public static SObjectFields$<CollaborationRoom> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public Id Id;
	public Boolean IsArchived;
	public Boolean IsAutoJoin;
	public Boolean IsDeleted;
	public Boolean IsExternal;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public String Name;
	public String PlatformKey;
	public Datetime SystemModstamp;
	public String TeamKey;

	public CollaborationRoom clone$() {throw new java.lang.UnsupportedOperationException();}
	public CollaborationRoom clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public CollaborationRoom clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public CollaborationRoom clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public CollaborationRoom clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
