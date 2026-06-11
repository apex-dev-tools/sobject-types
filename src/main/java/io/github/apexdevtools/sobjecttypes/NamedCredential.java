/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.Integer;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

@SuppressWarnings("unused")
public class NamedCredential extends SObject {
	public static SObjectType$<NamedCredential> SObjectType;
	public static SObjectFields$<NamedCredential> Fields;

	public Id AuthProviderId;
	public AuthProvider AuthProvider;
	public String AuthTokenEndpointUrl;
	public Boolean CalloutOptionsAllowMergeFieldsInBody;
	public Boolean CalloutOptionsAllowMergeFieldsInHeader;
	public Boolean CalloutOptionsGenerateAuthorizationHeader;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String Description;
	public String DeveloperName;
	public String Endpoint;
	public Id Id;
	public Boolean IsDeleted;
	public String JwtAudience;
	public String JwtFormulaSubject;
	public String JwtIssuer;
	public String JwtTextSubject;
	public Integer JwtValidityPeriodSeconds;
	public String Language;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String MasterLabel;
	public String NamespacePrefix;
	public String PrincipalType;
	public Datetime SystemModstamp;

	public CustomHttpHeader[] CustomHttpHeaders;
	public PaymentGateway[] PaymentGateways;
	public SetupEntityAccess[] SetupEntityAccessItems;
	public ExternalDataUserAuth[] UserAuths;

	public NamedCredential clone$() {throw new java.lang.UnsupportedOperationException();}
	public NamedCredential clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public NamedCredential clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public NamedCredential clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public NamedCredential clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
