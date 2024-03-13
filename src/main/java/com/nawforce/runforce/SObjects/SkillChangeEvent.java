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
public class SkillChangeEvent extends SObject {
	public static SObjectType$<SkillChangeEvent> SObjectType;
	public static SObjectFields$<SkillChangeEvent> Fields;

	public Object ChangeEventHeader;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String Description;
	public String DeveloperName;
	public Id Id;
	public String Language;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String MasterLabel;
	public String ReplayId;
	public Id TypeId;
	public SkillType Type;

	public SkillChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public SkillChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public SkillChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public SkillChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public SkillChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
