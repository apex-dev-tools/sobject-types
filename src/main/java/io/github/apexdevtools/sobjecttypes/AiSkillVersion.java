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
public class AiSkillVersion extends SObject {
	public static SObjectType$<AiSkillVersion> SObjectType;
	public static SObjectFields$<AiSkillVersion> Fields;

	public Id AiSkillId;
	public AiSkill AiSkill;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String FrontMatter;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public String Name;
	public String PrimaryAgent;
	public String Status;
	public Datetime SystemModstamp;
	public String VersionDescription;
	public String VersionKeyword;
	public Integer VersionNumber;

	public AiSkillVersion clone$() {throw new java.lang.UnsupportedOperationException();}
	public AiSkillVersion clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public AiSkillVersion clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public AiSkillVersion clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public AiSkillVersion clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
