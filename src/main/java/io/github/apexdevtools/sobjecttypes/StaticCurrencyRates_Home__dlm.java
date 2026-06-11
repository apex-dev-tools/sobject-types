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
public class StaticCurrencyRates_Home__dlm extends SObject {
	public static SObjectType$<StaticCurrencyRates_Home__dlm> SObjectType;
	public static SObjectFields$<StaticCurrencyRates_Home__dlm> Fields;

	public String DataSourceId__c;
	public String DataSourceObjectId__c;
	public String FromISOCurrencyCode__c;
	public Id Id;
	public String Id__c;
	public String InternalOrganizationId__c;
	public String KQ_Id__c;
	public Decimal RateDenominatorNumber__c;
	public Decimal RateNumeratorNumber__c;
	public String ToISOCurrencyCode__c;

	public StaticCurrencyRates_Home__dlm clone$() {throw new java.lang.UnsupportedOperationException();}
	public StaticCurrencyRates_Home__dlm clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public StaticCurrencyRates_Home__dlm clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public StaticCurrencyRates_Home__dlm clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public StaticCurrencyRates_Home__dlm clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
