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
