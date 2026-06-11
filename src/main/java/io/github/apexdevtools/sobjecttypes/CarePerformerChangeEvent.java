/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

@SuppressWarnings("unused")
public class CarePerformerChangeEvent extends SObject {
	public static SObjectType$<CarePerformerChangeEvent> SObjectType;
	public static SObjectFields$<CarePerformerChangeEvent> Fields;

	public Id AffiliatedOrganizationId;
	public Account AffiliatedOrganization;
	public Id CareSpecialtyId;
	public CareSpecialty CareSpecialty;
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
	public Id ParentRecordId;
	public SObject ParentRecord;
	public Id PersonId;
	public SObject Person;
	public String ReplayId;
	public Id RoleId;
	public SObject Role;

	public CarePerformerChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public CarePerformerChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public CarePerformerChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public CarePerformerChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public CarePerformerChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
