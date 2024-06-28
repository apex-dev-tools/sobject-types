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
public class EnrollmentEligibilityCriteriaChangeEvent extends SObject {
	public static SObjectType$<EnrollmentEligibilityCriteriaChangeEvent> SObjectType;
	public static SObjectFields$<EnrollmentEligibilityCriteriaChangeEvent> Fields;

	public Object ChangeEventHeader;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String Description;
	public Id Id;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Name;
	public Id OwnerId;
	public User Owner;
	public String ReplayId;
	public String SourceSystem;
	public String SourceSystemIdentifier;
	public String Status;

	public EnrollmentEligibilityCriteriaChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public EnrollmentEligibilityCriteriaChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public EnrollmentEligibilityCriteriaChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public EnrollmentEligibilityCriteriaChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public EnrollmentEligibilityCriteriaChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
