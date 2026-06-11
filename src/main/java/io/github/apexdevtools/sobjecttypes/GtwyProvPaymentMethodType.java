/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

@SuppressWarnings("unused")
public class GtwyProvPaymentMethodType extends SObject {
	public static SObjectType$<GtwyProvPaymentMethodType> SObjectType;
	public static SObjectFields$<GtwyProvPaymentMethodType> Fields;

	public String Comments;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String DeveloperName;
	public String GtwyProviderPaymentMethodType;
	public Id Id;
	public Boolean IsDeleted;
	public String Language;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastViewedDate;
	public String MasterLabel;
	public String NamespacePrefix;
	public Id PaymentGatewayProviderId;
	public PaymentGatewayProvider PaymentGatewayProvider;
	public String PaymentMethodType;
	public Id RecordTypeId;
	public RecordType RecordType;
	public Datetime SystemModstamp;

	public GtwyProvPaymentMethodType clone$() {throw new java.lang.UnsupportedOperationException();}
	public GtwyProvPaymentMethodType clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public GtwyProvPaymentMethodType clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public GtwyProvPaymentMethodType clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public GtwyProvPaymentMethodType clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
