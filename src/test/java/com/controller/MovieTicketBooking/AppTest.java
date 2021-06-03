package com.controller.MovieTicketBooking;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.springframework.test.context.junit4.SpringRunner;

import com.model.Ticket;
import com.service.TicketService;

@RunWith(JUnit4.class)
public class AppTest 
    //extends TestCase
{
	TicketService cut_ticketService = null;
	Ticket doc_testTicket = null;
	
	@Before
	public void setup()
	{
		cut_ticketService = new TicketService(); //Code Under Test
		doc_testTicket = new Ticket(); // Dependent On Component
	}

    @Test
    public void testCalculateTotalCostForKing()
    {		
    	doc_testTicket.setCircleType("King");
    	doc_testTicket.setNoOfTickets(1);
    	double totalTicketCost = this.cut_ticketService.calculateTotalCost(doc_testTicket);
        assertEquals(150.00, totalTicketCost, 0);
    }
    
    @Test
    public void testCalculateTotalCostForQueen()
    {
    	doc_testTicket.setCircleType("Queen");
    	doc_testTicket.setNoOfTickets(1);
    	double totalTicketCost = cut_ticketService.calculateTotalCost(doc_testTicket);
        assertEquals(250.00, totalTicketCost, 0);
    }
    
    @Test
    public void testCalculateTotalCostForKing_tktno_0()
    {		
    	doc_testTicket.setCircleType("King");
    	doc_testTicket.setNoOfTickets(0);
    	double totalTicketCost = cut_ticketService.calculateTotalCost(doc_testTicket);
        assertEquals(0.00, totalTicketCost, 0);
    }
    
    @Test
    public void testCalculateTotalCostForQueen_tktno_0()
    {
    	doc_testTicket.setCircleType("Queen");
    	doc_testTicket.setNoOfTickets(0);
    	double totalTicketCost = cut_ticketService.calculateTotalCost(doc_testTicket);
        assertEquals(0.00, totalTicketCost, 0);
    }
    
    @Test
    public void testCalculateTotalCostForKing_tktno_5()
    {		
    	doc_testTicket.setCircleType("King");
    	doc_testTicket.setNoOfTickets(5);
    	double totalTicketCost = cut_ticketService.calculateTotalCost(doc_testTicket);
        assertEquals(750.00, totalTicketCost, 0);
    }
    
    @Test
    public void testCalculateTotalCostForQueen_tktno_5()
    {
    	doc_testTicket.setCircleType("Queen");
    	doc_testTicket.setNoOfTickets(5);
    	double totalTicketCost = cut_ticketService.calculateTotalCost(doc_testTicket);
        assertEquals(1250.00, totalTicketCost, 0);
    }
    
    @Test
    public void testCalculateTotalCostForDummy()
    {
    	doc_testTicket.setCircleType("Dummy");
    	doc_testTicket.setNoOfTickets(10);
    	double totalTicketCost = cut_ticketService.calculateTotalCost(doc_testTicket);
        assertEquals(0.00, totalTicketCost, 0);
    }
    
}
