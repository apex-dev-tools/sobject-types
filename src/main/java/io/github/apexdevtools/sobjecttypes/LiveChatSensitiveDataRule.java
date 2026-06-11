/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.Integer;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

@SuppressWarnings("unused")
public class LiveChatSensitiveDataRule extends SObject {
	public static SObjectType$<LiveChatSensitiveDataRule> SObjectType;
	public static SObjectFields$<LiveChatSensitiveDataRule> Fields;

	public String ActionType;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String Description;
	public String DeveloperName;
	public Integer EnforceOn;
	public Id Id;
	public Boolean IsDeleted;
	public Boolean IsEnabled;
	public String Language;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String MasterLabel;
	public String NamespacePrefix;
	public String Pattern;
	public Integer Priority;
	public String ProcessingType;
	public String Replacement;
	public Datetime SystemModstamp;
	public String Version;

	public LiveChatSensitiveDataRule clone$() {throw new java.lang.UnsupportedOperationException();}
	public LiveChatSensitiveDataRule clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public LiveChatSensitiveDataRule clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public LiveChatSensitiveDataRule clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public LiveChatSensitiveDataRule clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
