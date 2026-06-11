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
public class OauthTokenExchangeHandler extends SObject {
	public static SObjectType$<OauthTokenExchangeHandler> SObjectType;
	public static SObjectFields$<OauthTokenExchangeHandler> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String Description;
	public String DeveloperName;
	public Id Id;
	public Boolean IsContactCreationAllowed;
	public Boolean IsDeleted;
	public Boolean IsEnabled;
	public Boolean IsUserCreationAllowed;
	public String Language;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String MasterLabel;
	public String NamespacePrefix;
	public Boolean SupportedTokenTypesAccessToken;
	public Boolean SupportedTokenTypesIdToken;
	public Boolean SupportedTokenTypesJwt;
	public Boolean SupportedTokenTypesRefreshToken;
	public Boolean SupportedTokenTypesSaml2;
	public Datetime SystemModstamp;
	public Id TokenHandlerApexId;
	public ApexClass TokenHandlerApex;

	public OauthTokenExchangeHandler clone$() {throw new java.lang.UnsupportedOperationException();}
	public OauthTokenExchangeHandler clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public OauthTokenExchangeHandler clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public OauthTokenExchangeHandler clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public OauthTokenExchangeHandler clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
