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
public class QuoteDocument extends SObject {
	public static SObjectType$<QuoteDocument> SObjectType;
	public static SObjectFields$<QuoteDocument> Fields;

	public Id ContentVersionDocumentId;
	public ContentVersion ContentVersionDocument;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Decimal Discount;
	public Blob Document;
	public Decimal GrandTotal;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Name;
	public Id QuoteId;
	public Quote Quote;
	public Datetime SystemModstamp;

	public QuoteDocument clone$() {throw new java.lang.UnsupportedOperationException();}
	public QuoteDocument clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public QuoteDocument clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public QuoteDocument clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public QuoteDocument clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
