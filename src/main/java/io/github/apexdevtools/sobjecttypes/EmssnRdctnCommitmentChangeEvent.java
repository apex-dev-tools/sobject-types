/*
 * Copyright (c) 2025 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.Integer;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

@SuppressWarnings("unused")
public class EmssnRdctnCommitmentChangeEvent extends SObject {
	public static SObjectType$<EmssnRdctnCommitmentChangeEvent> SObjectType;
	public static SObjectFields$<EmssnRdctnCommitmentChangeEvent> Fields;

	public Date ApprovalDate;
	public Object ChangeEventHeader;
	public Id CommitmentLetterId;
	public ContentDocument CommitmentLetter;
	public String CommitmentProgram;
	public String CommitmentType;
	public String CompanyBusinessRegion;
	public Integer CompanyEmployeeCount;
	public String CompanySector;
	public String CompanyType;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String CustomCommitmentProgram;
	public String CustomCommitmentType;
	public Id Id;
	public Boolean IsSmallandMediumEnterprise;
	public Boolean IsTargetUsedForForecasting;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Name;
	public Id OwnerId;
	public User Owner;
	public Id PrimaryContactId;
	public Contact PrimaryContact;
	public String ReplayId;
	public String Status;
	public Date TargetSettingDueDate;

	public EmssnRdctnCommitmentChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public EmssnRdctnCommitmentChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public EmssnRdctnCommitmentChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public EmssnRdctnCommitmentChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public EmssnRdctnCommitmentChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
