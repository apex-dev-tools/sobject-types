/*
 * Copyright (c) 2025 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

@SuppressWarnings("unused")
public class AiSkill extends SObject {
	public static SObjectType$<AiSkill> SObjectType;
	public static SObjectFields$<AiSkill> Fields;

	public Id ActiveAiSkillVersionId;
	public AiSkillVersion ActiveAiSkillVersion;
	public String ActiveVersion;
	public String AiSkillDefinition;
	public String ApiName;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String Description;
	public String FrontMatter;
	public Id Id;
	public Boolean IsDeleted;
	public Boolean IsInMyLibrary;
	public Id LastCreatedAiSkillVersionId;
	public AiSkillVersion LastCreatedAiSkillVersion;
	public String LastCreatedVersion;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public String Name;
	public String NamespacePrefix;
	public Id OwnerId;
	public Name Owner;
	public String PrimaryAgent;
	public String ShortDescription;
	public Boolean ShouldAddToUserLibrary;
	public String Source;
	public Id StandardSkillActiveVersionId;
	public AiSkillVersion StandardSkillActiveVersion;
	public String Status;
	public Datetime SystemModstamp;
	public String Type;
	public String TypeDoNotUse;
	public String Visibility;

	public AiSkillVersion[] AiSkillVersions;
	public AiSkillShare[] Shares;

	public AiSkill clone$() {throw new java.lang.UnsupportedOperationException();}
	public AiSkill clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public AiSkill clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public AiSkill clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public AiSkill clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
