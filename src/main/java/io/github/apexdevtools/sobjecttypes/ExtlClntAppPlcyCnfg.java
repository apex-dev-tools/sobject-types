/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

@SuppressWarnings("unused")
public class ExtlClntAppPlcyCnfg extends SObject {
	public static SObjectType$<ExtlClntAppPlcyCnfg> SObjectType;
	public static SObjectFields$<ExtlClntAppPlcyCnfg> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String DeveloperName;
	public Id ExternalClientApplicationId;
	public ExternalClientApplication ExternalClientApplication;
	public Id Id;
	public Boolean IsDeleted;
	public Boolean IsEnabled;
	public String Language;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String MasterLabel;
	public String MobilePluginStatus;
	public String NotifPluginStatus;
	public String OauthPluginStatus;
	public String PushPluginStatus;
	public String SamlPluginStatus;
	public String StartPage;
	public String StartUrl;
	public Datetime SystemModstamp;

	public ExtlClntAppPlcyCnfg clone$() {throw new java.lang.UnsupportedOperationException();}
	public ExtlClntAppPlcyCnfg clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ExtlClntAppPlcyCnfg clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ExtlClntAppPlcyCnfg clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ExtlClntAppPlcyCnfg clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
