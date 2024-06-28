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
public class CarePreauthChangeEvent extends SObject {
	public static SObjectType$<CarePreauthChangeEvent> SObjectType;
	public static SObjectFields$<CarePreauthChangeEvent> Fields;

	public Object ChangeEventHeader;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String Division;
	public Date EffectiveFrom;
	public Date EffectiveTo;
	public Id Id;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Id MemberPlanId;
	public MemberPlan MemberPlan;
	public String Name;
	public String Notes;
	public Id OwnerId;
	public User Owner;
	public Id PayerId;
	public Account Payer;
	public String PreauthIdentifier;
	public String ReferringPhysician;
	public String ReplayId;
	public String SourceSystem;
	public String SourceSystemIdentifier;
	public Datetime SourceSystemModified;
	public String Status;

	public CarePreauthChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public CarePreauthChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public CarePreauthChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public CarePreauthChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public CarePreauthChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
