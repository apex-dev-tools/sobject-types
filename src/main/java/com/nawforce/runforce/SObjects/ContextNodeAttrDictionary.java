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
public class ContextNodeAttrDictionary extends SObject {
	public static SObjectType$<ContextNodeAttrDictionary> SObjectType;
	public static SObjectFields$<ContextNodeAttrDictionary> Fields;

	public String ContextAttrDictIdentifier;
	public Id ContextNodeId;
	public ContextNode ContextNode;
	public Id ContextNodeMappingId;
	public ContextNodeMapping ContextNodeMapping;
	public String ContextNodeTagPrefix;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime SystemModstamp;

	public ContextNodeAttrDictionary clone$() {throw new java.lang.UnsupportedOperationException();}
	public ContextNodeAttrDictionary clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ContextNodeAttrDictionary clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ContextNodeAttrDictionary clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ContextNodeAttrDictionary clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
