/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class ServiceResourceSkillChangeEvent extends SObject {
	public static SObjectType$<ServiceResourceSkillChangeEvent> SObjectType;
	public static SObjectFields$<ServiceResourceSkillChangeEvent> Fields;

	public Object ChangeEventHeader;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Datetime EffectiveEndDate;
	public Datetime EffectiveStartDate;
	public Id Id;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String ReplayId;
	public Id ServiceResourceId;
	public ServiceResource ServiceResource;
	public Id SkillId;
	public Skill Skill;
	public Decimal SkillLevel;
	public String SkillNumber;

	public ServiceResourceSkillChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public ServiceResourceSkillChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ServiceResourceSkillChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ServiceResourceSkillChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ServiceResourceSkillChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
