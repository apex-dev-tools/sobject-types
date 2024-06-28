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
public class CareBarrierChangeEvent extends SObject {
	public static SObjectType$<CareBarrierChangeEvent> SObjectType;
	public static SObjectFields$<CareBarrierChangeEvent> Fields;

	public Id CareBarrierTypeId;
	public CareBarrierType CareBarrierType;
	public Id CaseId;
	public Case Case;
	public Object ChangeEventHeader;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String Description;
	public String Division;
	public Date EffectiveFrom;
	public Date EffectiveTo;
	public String ExtlProblemDefIdentifier;
	public Id Id;
	public Boolean IsActive;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Name;
	public Id OwnerId;
	public User Owner;
	public Id PatientId;
	public Account Patient;
	public String Priority;
	public Id ProblemDefinitionId;
	public ProblemDefinition ProblemDefinition;
	public String ReplayId;
	public String SourceSystemIdentifier;
	public Datetime SourceSystemModifiedDateTime;
	public String SourceSystemName;
	public String Status;

	public CareBarrierChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public CareBarrierChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public CareBarrierChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public CareBarrierChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public CareBarrierChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
