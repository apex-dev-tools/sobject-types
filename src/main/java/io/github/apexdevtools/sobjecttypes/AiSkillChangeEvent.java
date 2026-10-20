/*
 * Copyright (c) 2025 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.eventbus.ChangeEventHeader;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

@SuppressWarnings("unused")
public class AiSkillChangeEvent extends SObject {
	public static SObjectType$<AiSkillChangeEvent> SObjectType;
	public static SObjectFields$<AiSkillChangeEvent> Fields;

	public String ActiveVersion;
	public String AiSkillDefinition;
	public String ApiName;
	public ChangeEventHeader ChangeEventHeader;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String Description;
	public Id Id;
	public String LastCreatedVersion;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Name;
	public String NamespacePrefix;
	public Id OwnerId;
	public User Owner;
	public String PrimaryAgent;
	public String ReplayId;
	public String ShortDescription;
	public Boolean ShouldAddToUserLibrary;
	public String Source;
	public String Status;
	public String Type;
	public String Visibility;

	public AiSkillChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public AiSkillChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public AiSkillChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public AiSkillChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public AiSkillChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
