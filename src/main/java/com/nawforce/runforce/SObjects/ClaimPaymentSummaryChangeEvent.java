/*
 * Copyright (c) 2025 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class ClaimPaymentSummaryChangeEvent extends SObject {
	public static SObjectType$<ClaimPaymentSummaryChangeEvent> SObjectType;
	public static SObjectFields$<ClaimPaymentSummaryChangeEvent> Fields;

	public Datetime CancellationDate;
	public Object ChangeEventHeader;
	public Id ClaimId;
	public Claim Claim;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Id Id;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Name;
	public Decimal PaymentAmount;
	public Date PaymentDate;
	public String PaymentIdentifier;
	public String PaymentStatus;
	public String ReplayId;

	public ClaimPaymentSummaryChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public ClaimPaymentSummaryChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ClaimPaymentSummaryChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ClaimPaymentSummaryChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ClaimPaymentSummaryChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
