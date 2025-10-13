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
public class PartyRoleRelationChangeEvent extends SObject {
	public static SObjectType$<PartyRoleRelationChangeEvent> SObjectType;
	public static SObjectFields$<PartyRoleRelationChangeEvent> Fields;

	public Object ChangeEventHeader;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Id Id;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Name;
	public Id OwnerId;
	public User Owner;
	public Id RelatedInverseRecordId;
	public PartyRoleRelation RelatedInverseRecord;
	public String RelatedRoleName;
	public String RelationshipObjectName;
	public String ReplayId;
	public String RoleName;
	public Boolean ShouldCreaInversRoleAuto;

	public PartyRoleRelationChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public PartyRoleRelationChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public PartyRoleRelationChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public PartyRoleRelationChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public PartyRoleRelationChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
